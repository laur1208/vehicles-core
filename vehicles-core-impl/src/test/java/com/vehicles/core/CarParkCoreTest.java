package com.vehicles.core;

import com.vehicles.api.Storage;
import com.vehicles.api.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class CarParkCoreTest {

    @Mock
    private Storage storage;

    @Mock
    private User user;

    @InjectMocks
    private CarParkCore core;

    @Test
    void user() {
        when(storage.user()).thenReturn(user);
        assertThat(core.user()).isSameAs(user);
    }
}