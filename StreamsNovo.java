import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class StreamsNovo {

	public static void main(String[] args) {
		
		InputStream dis = new DataInputStream(System.in); 
		Reader read = new InputStreamReader(System.in);
//		BufferedInputStream bis = new BufferedInputStream(dis);		// u 3. snimku
		
		byte[] buffer = new byte[4];
		
		int numBytesRead;
		
			try {
				dis.mark(4);
				while( (numBytesRead = dis.read(buffer)) >= 0 ) {
					System.out.println( "procitali: " + numBytesRead + " bytea\n" + new String(buffer));
					buffer = new byte[buffer.length];				
					dis.reset;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}