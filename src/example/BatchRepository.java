package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchRepository {
    private Map<String, Batch> batchesCollection;

    public BatchRepository() {
        this.batchesCollection = new HashMap<String, Batch>();
    }

    public String add(Batch batch) {
        this.batchesCollection.put(batch.getId(), batch);
        return batch.getId();
    }

    public Batch update(Batch batch) {
        Boolean hasProduct = this.batchesCollection.containsKey(batch.getId());

        if (hasProduct) {
            this.batchesCollection.put(batch.getId(), batch);
        }

        return batch;
    }

    public Batch get(String batchId) {
        return batchesCollection.get(batchId);
    }

    public List<Batch> list() {
        List<Batch> result = new ArrayList<Batch>();

        this.batchesCollection.forEach((id, batch) -> {
            result.add(batch);
        });

        return result;
    }

    public void delete(String batchId) {
        this.batchesCollection.remove(batchId);
    }
}