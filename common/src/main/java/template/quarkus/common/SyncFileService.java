package template.quarkus.common;

// Used internal by Servers
public interface SyncFileService {

    void sync(String file, FileContent content);
}
