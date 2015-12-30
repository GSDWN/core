package com.artronics.gsdwn.core.device;

import com.artronics.gsdwn.core.exception.DeviceConnectionException;

public interface DeviceDriverService
{
    void open() throws DeviceConnectionException;

    void close() throws DeviceConnectionException;
}
