import java.io*;
import java.util.*;
import java.util.zip.*;
public class TestZip{
	public static void main (String args[]){
		String[] filenames=new String[]{"Student.ser","inputFile.txt"};
		byte[] buf = new byte[1024];

		try{
			String outFilename="outfile.zip";
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));

			for(int i=0;i<filenames.length;i++){
				FileInputStream in = new FileInputStream(filenames[i]);

				out.putNextEntry(new ZipEntry(filenames[i]));

				int len;
				while((len=in.read(buf))>0){
					out.write(buf,0,len);
				}
				out.closeEntry();
				in.close();
			}
			out.close();
		}
		catch(IOException e){
			
		}
		
	}
}