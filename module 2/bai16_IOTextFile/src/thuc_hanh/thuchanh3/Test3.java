package thuc_hanh.thuchanh3;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class Test3 {
    public static void main(String[] args) throws UnsupportedEncodingException, DataFormatException {
        //du lieu goc
        String input="The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.The Deflater class compresses the data.";
        System.out.println("length " +input.length());
        // nén du lieu
        byte[] inputObj=input.getBytes("UTF-8");
        byte[] output=new byte[1024];
        Deflater deflater= new Deflater();
        deflater.setInput(inputObj);
        deflater.finish();
        int compressDataLength= deflater.deflate(output);
        System.out.println(compressDataLength);
        // giai nen

        Inflater inflaterObj=new Inflater();
        inflaterObj.setInput(output,0,output.length);
        byte[] resultObj = new byte[1024];
        int resultLength =inflaterObj.inflate(resultObj);
        inflaterObj.end();

        String output2=new String(resultObj,0,resultLength);
        System.out.println(output2);

    }
}
