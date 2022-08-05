/*
 * created on Nov 30, 2009
 */
package cn.happymaya.ddp.support.xml;

import java.io.IOException;

/**
 * read resources by loader.
 * @author superhsc
 */
public interface ResourcePath {
	
	/**
	 * read resources by loader
	 * @return the array of Resources
	 */
	Resource[] getResources() throws IOException;

	/**
	 * @param filter the file filter
	 */
	void setFilter(Filter filter);
	
	/**
	 * @return the file filter
	 */
	Filter getFilter();
}
