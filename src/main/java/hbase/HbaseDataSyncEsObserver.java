package hbase;

import com.google.protobuf.Service;
import org.apache.hadoop.hbase.CoprocessorEnvironment;
import org.apache.hadoop.hbase.coprocessor.RegionCoprocessor;
import org.apache.hadoop.hbase.coprocessor.RegionObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class HbaseDataSyncEsObserver implements RegionObserver, RegionCoprocessor {
    private static final Logger LOG = LoggerFactory.getLogger(HbaseDataSyncEsObserver.class);

    public HbaseDataSyncEsObserver() {
        super();
    }

    public void start(CoprocessorEnvironment env) throws IOException {

    }

    public void stop(CoprocessorEnvironment env) throws IOException {

    }

    public Iterable<Service> getServices() {
        return null;
    }
}
