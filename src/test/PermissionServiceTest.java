package test;

import main.ex05.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermissionServiceTest {

    private User user;

    @Test
    void adminPermissions() {

        user = new User("admin", Role.ADMIN);

        assertAll("ADMIN permissions",

                () -> assertTrue(
                        PermissionService.canPerformAction(user, Action.DELETE_USER)),

                () -> assertTrue(
                        PermissionService.canPerformAction(user, Action.LOCK_USER)),

                () -> assertTrue(
                        PermissionService.canPerformAction(user, Action.VIEW_PROFILE))
        );
    }

    @Test
    void moderatorPermissions() {

        user = new User("mod", Role.MODERATOR);

        assertAll("MODERATOR permissions",

                () -> assertFalse(
                        PermissionService.canPerformAction(user, Action.DELETE_USER)),

                () -> assertTrue(
                        PermissionService.canPerformAction(user, Action.LOCK_USER)),

                () -> assertTrue(
                        PermissionService.canPerformAction(user, Action.VIEW_PROFILE))
        );
    }

    @Test
    void userPermissions() {

        user = new User("user", Role.USER);

        assertAll("USER permissions",

                () -> assertFalse(
                        PermissionService.canPerformAction(user, Action.DELETE_USER)),

                () -> assertFalse(
                        PermissionService.canPerformAction(user, Action.LOCK_USER)),

                () -> assertTrue(
                        PermissionService.canPerformAction(user, Action.VIEW_PROFILE))
        );
    }

    @AfterEach
    void cleanup() {
        user = null;
    }
}