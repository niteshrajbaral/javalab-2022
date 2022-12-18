import java.io.*;
import java.util.*;
import java.util.zip.*;

public class ZipContents{
	public static void main(String args[]){
		try{
			ZipFile zf= new ZipFile("outfile.zip");

			for (Enumeration entries= zf.entries();entries.hasMoreElements();){
				String zipEntryName=((ZipEntry)entries.nextElement()).getName();
				System.out.println("name: "+zipEntryName);
			}
		}
		catch (IOException e){
			
		}
	}
}
