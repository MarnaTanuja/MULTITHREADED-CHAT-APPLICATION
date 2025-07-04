# MULTITHREADED-CHAT-APPLICATION

*COMPANY* : CODTECH IT SOLUTIONS

*NAME* : MARNATANUJA

*INTERNID* : CT04DN736

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* : NEELA SANTOSH

*Java Client-Server Chat System* 

This project, titled “Java Client-Server Chat System”, demonstrates a basic real-time messaging application built using Java’s Socket and ServerSocket classes. The primary goal of the project is to enable two-way communication between a server and one or more clients using TCP/IP networking. Implemented and tested using Visual Studio Code, this system serves as a foundational exercise in Java networking and multithreading.

The system consists of two main components: Server.java and Client.java. The server initializes a socket to listen on a specific port (e.g., 12345) and waits for incoming client connections. Once a client connects, both parties can exchange messages in real time using input and output streams. The communication model uses blocking I/O and a basic message loop to simulate a live chat environment. The client, on the other hand, establishes a connection to the server’s IP address and port and launches a thread to listen for incoming messages while allowing the user to input and send messages concurrently.

*Key Components:*

-Server.java: Initializes a ServerSocket, waits for a client connection, and handles incoming messages. It uses BufferedReader and PrintWriter for message transmission, and InputStreamReader for reading from the console. The server can read messages from the client and respond back interactively in real-time.

-Client.java: Connects to the server using a Socket, launches a dedicated thread to handle incoming messages from the server, and allows the user to send responses in parallel. The use of a nested Runnable class (ReceiveMessages) enables asynchronous reading of server messages without blocking the main thread, allowing for smooth user interaction.

-Multithreading: The client utilizes a background thread to continuously read incoming messages while keeping the main thread responsive for input. This is essential for any real-time messaging application to work effectively.

*Functionality Overview:*

-Server Initialization: The server listens on a specified port using new ServerSocket(port) and waits for client connections.

-Client Connection: The client connects to the server using new Socket("localhost", port) to initiate communication.

-Bidirectional Messaging: Both the server and client can send and receive messages using text streams.

-User Interaction: Inputs are collected through the console, making the system fully interactive and command-line based.

-Threaded Listening: The client’s background thread listens for server messages without interrupting user typing.

*Execution Environment:*

-Language: Java (JDK 21)

-IDE: Visual Studio Code

-Execution Steps:

-Compile both files:

bash
Copy code
javac Server.java
javac Client.java
Run in two separate terminals:

bash
Copy code
java Server
java Client

*Learning Outcomes:*

This project introduces essential Java networking concepts, including socket programming, input/output stream management, and thread-based concurrency. It lays a strong foundation for understanding how real-time communication systems operate at a lower level using the TCP/IP protocol stack. By creating a working text-based chat tool, developers are exposed to the client-server model, blocking communication, and message synchronization.

This system mimics the architecture behind chat applications, online games, messaging servers, and collaborative tools. It is an excellent starting point for students and developers interested in distributed systems, multithreaded programming, or real-time software development. It also provides a strong base for future enhancements like multi-client support, GUI integration, or protocol security.

##OUTPUT:
![Image](https://github.com/user-attachments/assets/4895f9b6-2fd2-4a6a-ac95-c6dd40558154)

![Image](https://github.com/user-attachments/assets/44b04cbd-fdce-4ec2-bb0a-e0d9d0b836b2)

![Image](https://github.com/user-attachments/assets/01b13442-c982-4c13-ad6b-928521f0e3d6)

![Image](https://github.com/user-attachments/assets/a24f4068-945d-435a-ac38-9418b0043b6c)

![Image](https://github.com/user-attachments/assets/5d543a7d-f419-4012-9508-c351a5894500)

![Image](https://github.com/user-attachments/assets/1f1412cc-aaf7-443f-8961-f839e831c0d8)




