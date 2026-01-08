package template.quarkus.common;

public class FileEntry {
    private final String filename;
    private int version;
    private byte[] data;

    public FileEntry(String filename, int version, byte[] data) {
        this.filename = filename;
        this.version = version;
        this.data = data;
    }


    public FileEntry setVersion(int version){
        this.version = version;
        return this;
    }

    public FileEntry setData(byte[] data){
        this.data = data;
        return this;
    }

    public String getFilename() {
        return filename;
    }

    public int getVersion() {
        return version;
    }

    public byte[] getData() {
        return data;
    }
}

