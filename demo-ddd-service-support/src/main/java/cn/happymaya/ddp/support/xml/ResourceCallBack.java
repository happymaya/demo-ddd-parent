package cn.happymaya.ddp.support.xml;

import java.io.InputStream;

/**
 * The callback function for reading resources.
 * @author superhsc
 */
@FunctionalInterface
public interface ResourceCallBack {

	/**
	 * @param inputStream input stream
	 */
	void apply(InputStream inputStream);
}
