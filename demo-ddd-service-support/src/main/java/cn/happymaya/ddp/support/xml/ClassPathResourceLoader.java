package cn.happymaya.ddp.support.xml;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * load resources with class local path.
 * @author superhsc
 */
public class ClassPathResourceLoader extends AbstractResourceLoader implements ResourceLoader {

    private static final Log log = LogFactory.getLog(ClassPathResourceLoader.class);

    private Class<?> clazz = this.getClass();

    public ClassPathResourceLoader() {
        super();
    }

    /**
     * @param clazz the class to load resource
     */
    public ClassPathResourceLoader(Class<?> clazz) {
        if (clazz != null) this.clazz = clazz;
    }

    @Override
    public boolean loadResource(ResourceCallBack callback, String path) throws IOException {
        Resource resource = new ClassPathResource(path, clazz);
        log.debug(resource.getFile().getCanonicalFile());
        InputStream is = resource.getInputStream();
        if (is == null) {
            return false;
        }
        callback.apply(is);
        return true;
    }
}
