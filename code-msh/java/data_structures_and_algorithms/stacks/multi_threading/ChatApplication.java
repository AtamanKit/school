public class ChatApplication {
    private StringBuffer sharedChatHistory = new StringBuffer();

    // Thread to simulate receiving messages
    Thread receivingThread = new Thread(new Runnable() {
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                synchronized(sharedChatHistory) {
                    sharedChatHistory.append("Received message " + i + "\n");
                }
            }
        }
    });

    // Thread to simulate sending messages
    Thread sendingThread = new Thread(new Runnable() {
        public void run() {
            for (int i=0; i<10; i++) {  // Loop 10 times, not 0
                try {
                    Thread.sleep(800);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                synchronized(sharedChatHistory) {
                    sharedChatHistory.append("Send message " + i + "\n");
                }
            }
        }
    });

    void startChat() {
        receivingThread.start();
        sendingThread.start();
    }

    void printChatHistory() throws InterruptedException {
        // Wait for both threads to finish
        receivingThread.join();
        sendingThread.join();

        System.out.println(sharedChatHistory.toString());
    }

    public static void main(String[] args) throws InterruptedException {
        ChatApplication chatApp = new ChatApplication();
        chatApp.startChat();
        chatApp.printChatHistory();
    }
}
