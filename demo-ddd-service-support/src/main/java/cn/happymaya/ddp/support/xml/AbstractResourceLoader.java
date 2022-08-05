package cn.happymaya.ddp.support.xml;

import java.io.IOException;

/**
 * @author superhsc
 */
public abstract class AbstractResourceLoader implements ResourceLoader {
	private Filter filter = null;

	/**
	 * @return the file filter, default the xml file filter.
	 */
	@Override
	public Filter getFilter() {
		if(filter==null){
			filter = new Filter(){
				public boolean isSatisfied(String fileName) {
					return fileName.endsWith(".xml") || fileName.endsWith(".XML");
				}};
		}
		return filter;
	}

	/**
	 * @param filter the file filter, default the xml file filter.
	 */
	@Override
	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	@Override
	public boolean loadResource(ResourceCallBack callback, String... paths) throws IOException {
		boolean success = true;
		for (String path : paths) {
			if (!loadResource(callback, path)) success = false;
		}
		return success;
	}
}
