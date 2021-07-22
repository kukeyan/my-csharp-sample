import java.security.MessageDigest;


public class MD5Util {
	
	
    public final static String MD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};       
        try {
            byte[] btInput = s.getBytes();
            // ���MD5ժҪ�㷨�� MessageDigest ����
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // ʹ��ָ�����ֽڸ���ժҪ
            mdInst.update(btInput);
            // �������
            byte[] md = mdInst.digest();
            // ������ת����ʮ�����Ƶ��ַ�����ʽ
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
	
	
	

	
	
	
	
    public static byte[]  string2MD5Array(String inStr){  
        MessageDigest md5 = null;  
        try{  
            md5 = MessageDigest.getInstance("MD5");  
        }catch (Exception e){  
            System.out.println(e.toString());  
            e.printStackTrace();  
            return null;  
        }  
        char[] charArray = inStr.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i];  
        byte[] md5Bytes = md5.digest(byteArray);  
        
        return md5Bytes;    
    }  	
	
	
	
	public static String getHexString(byte[]  bytes) {
		
		StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < bytes.length; i++){  
            int val = ((int) bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString(); 
		
	}
	
	
    /*** 
     * MD5���� ����32λmd5�� 
     */  
    public static String string2MD5(String inStr){  
        byte[] md5Bytes = string2MD5Array(inStr);  
		return getHexString(md5Bytes);
    }  		
	
	
	
	
	
	
	
	
    public static void main(String[] args) {
        System.out.println(MD5Util.MD5("230103198602230916"));
		
		System.out.println(MD5Util.string2MD5("230103198602230916"));
    }
	
}