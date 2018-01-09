package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CostumInputStream extends FilterInputStream{
	
	private InputStream mInputStream;
	
	protected CostumInputStream(InputStream in) {
		super(in);
		mInputStream = in;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		//int temp = mInputStream.read();
		int result = super.read();
		if(result == -1) return -1;
		char tempChar = (char)result;
		if(Character.isUpperCase(tempChar)) {
			tempChar = Character.toLowerCase(tempChar);
		}
		return tempChar;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\chisunhuang\\Desktop\\testFile.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		CostumInputStream mCostumInputStream = new CostumInputStream(bis);
		int a;
		while((a = mCostumInputStream.read()) != -1 ) {
			char ch = (char)a;
			System.out.print(ch);
		}		
	}

}
