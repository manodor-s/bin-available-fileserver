package template.quarkus.common;

import java.util.HashMap;
import java.util.Map;

import jakarta.inject.Singleton;

@Singleton
public class FileStore {
    private Map<String, FileEntry> store = new HashMap<>();
    private int latestVersion = 1;

    public int updateFileStore(UpdatePackage message) {
        if(message.getUntilVersion() <= latestVersion) return -2;
        if(latestVersion - message.getAfterVersion() > 1) return latestVersion;
        message.getFiles().forEach((filename, fileEntry) -> {
            store.put(filename, fileEntry);
        });
        latestVersion = message.getUntilVersion();
        return 0;
    }

    public FileEntry getFileEntry(String filename) {
        return store.get(filename);
    }

    public int getVersion(String filename){
        return store.get(filename).getVersion();
    }

    public int getLatestVersion(){
        return latestVersion;
    }

    public Map<String, FileEntry> getFilesChangedAfterVersion(int version){
        Map<String, FileEntry> changedAfterVersion = new HashMap<>();
        store.forEach((key, value) -> {
            if(value.getVersion() > version) changedAfterVersion.put(key, value);
        });
        return changedAfterVersion;
    }


    // ggf. weitere Methoden z.B. zum Updaten der Version
}

