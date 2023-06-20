package is.qrk3.util;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class DemoBean {

    public void onCreate(@Observes StartupEvent ev) {
        System.out.println("on create fired!!!");
    }

}
