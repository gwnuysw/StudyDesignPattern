package adapter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class FileProperties implements FileIO{

	Properties properties;
	
	public FileProperties() {
		properties = new Properties();
	}
	@Override
	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream read = new FileInputStream(filename);
		properties.load(read);
		read.close();
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream write = new FileOutputStream(filename);
		String comments = "Written by FileProperties\n";
		comments.concat(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
		properties.store(write, comments);
		write.close();
	}

	@Override
	public void setValue(String key, String value) {
		// TODO Auto-generated method stub
		properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		// TODO Auto-generated method stub
		return properties.getProperty(key);
	}

}
