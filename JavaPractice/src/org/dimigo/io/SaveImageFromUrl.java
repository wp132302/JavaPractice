package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSlsHIBtQvL2VdrRhLzkZpcN07Xk9t7_CxuoL2qyyTrewt1h3Vm";
		URL url = null;
		
		try {
			url = new URL(imageUrl);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			int result;
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/image(1).jpg")){
				

				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1 ) {
					os.write(buf, 0, result);
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
					
					//파일을 write하기
	}

}
