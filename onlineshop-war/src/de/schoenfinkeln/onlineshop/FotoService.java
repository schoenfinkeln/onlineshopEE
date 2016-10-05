package de.schoenfinkeln.onlineshop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;

public class FotoService implements Runnable {
	private InputStream is;
	private OutputStream os;

	public FotoService(InputStream is, OutputStream os) {
		super();
		this.is = is;
		this.os = os;
	}

	@Override
	public void run() {
		try {
			byte[] b = new byte[1024];
			int i = 0;
			while ( (i = is.read(b)) != -1 ) {
				os.write(b, 0, i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close(); 
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
