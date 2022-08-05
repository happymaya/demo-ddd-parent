package cn.happymaya.ddp.support.xml;

import java.io.IOException;

/**
 * The loader for reading resources.
 * @author superhsc
 */
public interface ResourceLoader {

	/**
	 * @return the filter
	 */
	Filter getFilter();

	/**
	 * @param filter the filter to set
	 */
	void setFilter(Filter filter);

	/**
	 * load the resource by the path.
	 * @param callback call back
	 * @param path path
	 * @return whether loaded the resource success.
	 */
	boolean loadResource(ResourceCallBack callback, String path) throws IOException;
	
	/**
	 * load the resource by one more paths.
	 * @param callback class back
	 * @param paths paths
	 * @return whether loaded the resource success.
	 */
	boolean loadResource(ResourceCallBack callback, String... paths) throws IOException;
}