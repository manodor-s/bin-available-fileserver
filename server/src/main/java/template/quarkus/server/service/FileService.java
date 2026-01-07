package template.quarkus.server.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import template.quarkus.common.SyncFileService;
import template.quarkus.common.UpdatePackage;

@ApplicationScoped
public class FileService {

    private static final Logger log = LoggerFactory.getLogger(FileService.class);

    private final Map<String, String> storage = new ConcurrentHashMap<>();

    @Inject
    private SyncFileServiceRegistry syncFileServiceRegistry;

    private Collection<SyncFileService> syncFileServiceReplicas;

    public FileService() {}

    @PostConstruct
    public void init() {
        syncFileServiceReplicas = syncFileServiceRegistry.getAllRegistered();
    }

    public void store(UpdatePackage updatePackage) {
        // TODO store
    }

    public void writeThrough(UpdatePackage updatePackage) {
        // TODO store
        syncFileServiceReplicas.parallelStream().forEach(fs -> fs.sync(updatePackage));
    }

    public String read(String file) {
        return storage.get(file);
    }
}
