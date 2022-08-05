package cn.happymaya.ddp.support.xml;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * search and read file with java.io.File
 * @author superhsc
 */
public class FileResource implements Resource, ResourcePath {

	private static final Log log = LogFactory.getLog(FileResource.class);

	private static final String REGEX = "\\";
	private File file;
	private Filter filter = null;

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * Default constructor
	 */
	public FileResource() {
		super();
	}

	/**
	 * Constructor for file
	 * @param file file
	 */
	public FileResource(File file) {
		super();
		this.file = file;
		log.debug("loading "+this.getDescription());
	}
	
	/**
	 * read files with the code <code>new FileInputStream(file)</code>,
	 * and return null if it is a directory.
	 * @return InputStream
	 */
	public InputStream getInputStream() throws IOException {
		File file = this.getFile();
		if(file==null||file.isDirectory()){
			return null;
		}
		Filter filter = this.getFilter();
		if(filter!=null&&!filter.isSatisfied(file.getName())){
			return null;
		}
		return new FileInputStream(file);
	}
	
	/**
	 * get all the files in the path with the method <code>File.listFiles()</code>
	 * @return Resource[]
	 */
	public Resource[] getResources() throws IOException {
		File file = this.getFile();
		if(file==null){return null;}
		if(file.isDirectory()){
			File[] files = file.listFiles();
			Filter filter = this.getFilter();
			List<FileResource> fileLoaders = new ArrayList<FileResource>();
			for (File value : files) {
				if (filter != null && !filter.isSatisfied(value.getName())) {
					continue;
				}
				fileLoaders.add(new FileResource(value));
			}
			return (Resource[])fileLoaders.toArray(new Resource[fileLoaders.size()]);
		}
		Resource resource = new FileResource(file);
		resource.setFilter(this.getFilter());
		return new Resource[]{resource};
	}
	
	@Override
	public String getDescription() {
		try {
			return (new StringBuffer("FileResource:[file:"))
						.append(this.getFile().getCanonicalPath()).append("]").toString();
		} catch (IOException e) {
			return ""; // throw new RuntimeException(e);
		}
	}

	@Override
	public Filter getFilter() {
		return this.filter;
	}
	
	@Override
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	
	@Override
	public String getFileName() {
		if(this.getFile()==null){return null;}
		String fileName = this.getFile().getName();
		if(fileName.regionMatches(0, REGEX, 0, 2)) {
			fileName = fileName.replaceAll(REGEX, "/");
		}
		return fileName;
	}
}
