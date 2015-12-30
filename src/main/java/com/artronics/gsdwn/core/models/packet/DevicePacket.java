package com.artronics.gsdwn.core.models.packet;

import org.apache.log4j.Logger;

import java.util.List;

public class DevicePacket
{
    private final static Logger log = Logger.getLogger(DevicePacket.class);

    private final List<Integer> buffer;
    private final Long controllerId;
    private final Long deviceId;

    public DevicePacket(List<Integer> buffer,Long controllerId, Long deviceId)
    {
        this.buffer = buffer;
        this.controllerId = controllerId;
        this.deviceId = deviceId;
    }

    public List<Integer> getBuffer()
    {
        return buffer;
    }

    public Long getDeviceId()
    {
        return deviceId;
    }
}
