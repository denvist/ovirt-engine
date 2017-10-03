package org.ovirt.engine.core.common.action;

import java.util.Collection;

import org.ovirt.engine.core.common.businessentities.VM;
import org.ovirt.engine.core.common.businessentities.storage.DiskImage;
import org.ovirt.engine.core.compat.Guid;

public class CreateOvaParameters extends ActionParametersBase {

    private VM vm;
    private Collection<DiskImage> disks;
    private Guid proxyHostId;
    private String directory;
    private String name;

    public VM getVm() {
        return vm;
    }

    public void setVm(VM vm) {
        this.vm = vm;
    }

    public Collection<DiskImage> getDisks() {
        return disks;
    }

    public void setDisks(Collection<DiskImage> disks) {
        this.disks = disks;
    }

    public Guid getProxyHostId() {
        return proxyHostId;
    }

    public void setProxyHostId(Guid proxyHostId) {
        this.proxyHostId = proxyHostId;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String path) {
        this.directory = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
