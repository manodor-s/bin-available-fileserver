package template.quarkus.common;

import java.util.Map;

public class UpdatePackage {

    private int version;
    private Map<String, byte[]> files;

    public UpdatePackage() {}

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Map<String, byte[]> getFiles() {
        return files;
    }

    public void setFiles(Map<String, byte[]> files) {
        this.files = files;
    }
}
