public class ThreeWayHandShakeTCP {
    /*
     * A method to generate random sequence number
     */
    public static int sequenceGenerator() {
        return (int) (900000000 + Math.random() * 80000001);
    }
    public static void delay(int seconds) {
        seconds *= 1000;
        for (int i = seconds / 1000; i >= 0; i--) {
            System.out.print(" ... ");
            try {
                Thread.sleep(seconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        System.out.print("\nEstablishing TCP/IP connection between Compture A and Computer B");
        delay(1);
        int synSequence = sequenceGenerator();
        int ackSequence = 0;
        System.out.print("Computer A SYN: \tSYN(1) \tACK(0) \tSEQUENCE # : " + synSequence + "\tACKNOWLEDGEMENT SEQUENCE # : " + ackSequence);
        delay(1);
        ackSequence = sequenceGenerator();
        System.out.print("Computer B SYN/ACK: \tSYN(1) \tACK(1) \tSEQUENCE # : " + ackSequence + "\tACKNOWLEDGEMENT SEQUENCE # : " + (synSequence + 1));
        delay(1);
        System.out.println("Computer A ACK: \tSYN(0) \tACK(1) \tSEQUENCE # : " + (synSequence + 1) + "\tACKNOWLEDGEMENT SEQUENCE # : " + (ackSequence + 1) +"\n");
        System.out.println("TCP/IP Connection Successful...\n");
        System.out.print("Sending a file to Computer B");
        delay(2);
        int fileSize = sequenceGenerator() % 9000;
        System.out.print("File size : " + fileSize + " bytes");
        delay(1);
        System.out.print("Adding file size to SEQUENCE # : " + (synSequence + 1) + " + " + fileSize + " = " + ((synSequence + 1) + fileSize));
        delay(1);
        System.out.println("Computer A : \tSYN(1) \tACK(1) \tSEQUENCE # : " + ((synSequence + 1) + fileSize) + "\tACKNOWLEDGEMENT SEQUENCE # : " + (ackSequence + 1) +"\n");
        System.out.println("Computer B : \tSYN(1) \tACK(1) \tSEQUENCE # : " + sequenceGenerator() + "\tACKNOWLEDGEMENT SEQUENCE # : " + ((synSequence + 1) + fileSize) +"\n");
    }
}
