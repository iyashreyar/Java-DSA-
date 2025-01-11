
//ques - https://www.naukri.com/code360/problems/encode-the-message_699836?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube

public class CodingNinjasQ7 {
    public static void main(String[] args) {
        String text = "aabbc";
        System.out.println(encode(text));
    }
    static String encode(String message) {
        // Handle the edge case of an empty string
        if (message == null || message.length() == 0) {
            return "";
        }
        
        StringBuilder encodedMessage = new StringBuilder();
        int count = 1;

        for (int i = 1; i < message.length(); i++) {
            // If the current character is the same as the previous one, increment the count
            if (message.charAt(i) == message.charAt(i-1)){
                count++;
            } else {
                // Append the previous character and its count to the result
                encodedMessage.append(message.charAt(i-1)).append(count);
                count = 1; // Reset the count for the next character
            }
        }
        // Append the last character and its count
        encodedMessage.append(message.charAt(message.length()-1)).append(count);
        return encodedMessage.toString();
	}
}
