module org.apache.markt.impl {
    exports org.apache.markt.impl;
    requires org.apache.markt.api;
    provides org.apache.markt.api.MyService with org.apache.markt.impl.MyServiceImpl;
}