public class LinkedListExamples {

    // -------------------------------
    // 1. Singly Linked List - Employee Records
    static class EmployeeNode {
        int id;
        String name;
        String department;
        double salary;
        EmployeeNode next;

        public EmployeeNode(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.next = null;
        }
    }

    static class EmployeeLinkedList {
        EmployeeNode head;

        void addEmployee(int id, String name, String department, double salary) {
            EmployeeNode newNode = new EmployeeNode(id, name, department, salary);
            if (head == null) {
                head = newNode;
                return;
            }
            EmployeeNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        void deleteEmployee(int id) {
            if (head == null) return;
            if (head.id == id) {
                head = head.next;
                return;
            }
            EmployeeNode temp = head;
            while (temp.next != null && temp.next.id != id) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        EmployeeNode searchById(int id) {
            EmployeeNode temp = head;
            while (temp != null) {
                if (temp.id == id) return temp;
                temp = temp.next;
            }
            return null;
        }

        EmployeeNode searchByName(String name) {
            EmployeeNode temp = head;
            while (temp != null) {
                if (temp.name.equalsIgnoreCase(name)) return temp;
                temp = temp.next;
            }
            return null;
        }

        void displayEmployees() {
            EmployeeNode temp = head;
            while (temp != null) {
                System.out.println("ID: " + temp.id + ", Name: " + temp.name +
                        ", Dept: " + temp.department + ", Salary: " + temp.salary);
                temp = temp.next;
            }
        }
    }

    // -------------------------------
    // 2. Doubly Linked List - Browser History
    static class HistoryNode {
        String url;
        HistoryNode next, prev;

        public HistoryNode(String url) {
            this.url = url;
            this.next = this.prev = null;
        }
    }

    static class BrowserHistory {
        HistoryNode current;

        void visit(String url) {
            HistoryNode newNode = new HistoryNode(url);
            if (current != null) {
                current.next = newNode;
                newNode.prev = current;
            }
            current = newNode;
        }

        void back() {
            if (current != null && current.prev != null) {
                current = current.prev;
                System.out.println("Back to: " + current.url);
            } else {
                System.out.println("No previous page.");
            }
        }

        void forward() {
            if (current != null && current.next != null) {
                current = current.next;
                System.out.println("Forward to: " + current.url);
            } else {
                System.out.println("No next page.");
            }
        }

        void currentPage() {
            if (current != null)
                System.out.println("Current page: " + current.url);
            else
                System.out.println("No page visited yet.");
        }
    }

    // -------------------------------
    // 3. Circular Linked List - Playlist
    static class SongNode {
        String songName;
        String artist;
        double duration;
        SongNode next;

        public SongNode(String songName, String artist, double duration) {
            this.songName = songName;
            this.artist = artist;
            this.duration = duration;
            this.next = this; // Circular link
        }
    }

    static class Playlist {
        SongNode head = null;
        SongNode tail = null;
        SongNode current = null;

        void addSong(String songName, String artist, double duration) {
            SongNode newNode = new SongNode(songName, artist, duration);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                newNode.next = head;
                tail = newNode;
            }
        }

        void deleteSong(String songName) {
            if (head == null) return;

            SongNode curr = head;
            SongNode prev = tail;
            do {
                if (curr.songName.equalsIgnoreCase(songName)) {
                    if (curr == head) {
                        head = head.next;
                        tail.next = head;
                    } else if (curr == tail) {
                        tail = prev;
                        tail.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                    return;
                }
                prev = curr;
                curr = curr.next;
            } while (curr != head);
        }

        void playNext() {
            if (current == null) {
                current = head;
            } else {
                current = current.next;
            }
            System.out.println("Now Playing: " + current.songName + " by " + current.artist);
        }

        void displayPlaylist() {
            if (head == null) return;
            SongNode temp = head;
            do {
                System.out.println(temp.songName + " - " + temp.artist + " (" + temp.duration + " mins)");
                temp = temp.next;
            } while (temp != head);
        }
    }

    // -------------------------------
    // MAIN METHOD: Run all three examples
    public static void main(String[] args) {

        // -----------------
        System.out.println("=== Employee Linked List ===");
        EmployeeLinkedList empList = new EmployeeLinkedList();
        empList.addEmployee(101, "Alice", "HR", 50000);
        empList.addEmployee(102, "Bob", "IT", 60000);
        empList.addEmployee(103, "Carol", "Finance", 55000);
        empList.displayEmployees();

        System.out.println("-- After Deletion of ID 102 --");
        empList.deleteEmployee(102);
        empList.displayEmployees();

        System.out.println("-- Search for ID 103 --");
        EmployeeNode emp = empList.searchById(103);
        if (emp != null)
            System.out.println("Found: " + emp.name + " in " + emp.department);

        // -----------------
        System.out.println("\n=== Browser History ===");
        BrowserHistory history = new BrowserHistory();
        history.visit("google.com");
        history.visit("openai.com");
        history.visit("github.com");
        history.back();
        history.currentPage();
        history.forward();
        history.currentPage();

        // -----------------
        System.out.println("\n=== Playlist (Circular Linked List) ===");
        Playlist playlist = new Playlist();
        playlist.addSong("Let It Be", "The Beatles", 3.5);
        playlist.addSong("Imagine", "John Lennon", 4.0);
        playlist.addSong("Bohemian Rhapsody", "Queen", 6.0);
        playlist.displayPlaylist();

        System.out.println("-- Playing Songs --");
        playlist.playNext();
        playlist.playNext();

        System.out.println("-- After Deleting 'Imagine' --");
        playlist.deleteSong("Imagine");
        playlist.displayPlaylist();
    }
}
