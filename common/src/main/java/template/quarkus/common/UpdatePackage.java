package template.quarkus.common;

import java.util.Map;

public class UpdatePackage {

    private int untilVersion;
    private int afterVersion;
    private Map<String, FileEntry> files;

    public UpdatePackage(int untilVersion, int afterVersion, Map<String, FileEntry> files) {
        this.untilVersion = untilVersion;
        this.afterVersion = afterVersion;
        this.files = files;
    }

    public int getUntilVersion() {
        return untilVersion;
    }

    public int getAfterVersion() {
        return afterVersion;
    }

    public void setUntilVersion(int untilVersion) {
        this.untilVersion = untilVersion;
    }

    public void setAfterVersion(int afterVersion) {
        this.afterVersion = afterVersion;
    }

    public Map<String, FileEntry> getFiles() {
        return files;
    }

    public void setFiles(Map<String, FileEntry> files) {
        this.files = files;
    }
}
