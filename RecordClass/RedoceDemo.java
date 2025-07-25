
//     private final String name;
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
//     public int getId() {
//         return id;
//     }
//     public String getName() {
//         return name;
//     }
//     @Override
//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         sb.append("Alien{");
//         sb.append("id=").append(id);
//         sb.append(", name=").append(name);
//         sb.append('}');
//         return sb.toString();
//     }
//     @Override
//     public int hashCode() {
//         int hash = 7;
//         hash = 79 * hash + this.id;
//         hash = 79 * hash + Objects.hashCode(this.name);
//         return hash;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) {
//             return true;
//         }
//         if (obj == null) {
//             return false;
//         }
//         if (getClass() != obj.getClass()) {
//             return false;
//         }
//         final Alien other = (Alien) obj;
//         if (this.id != other.id) {
//             return false;
//         }
//         return Objects.equals(this.name, other.name);
//     }
// }
// The recode class will implement the entire 50 lines of code in just one line below
record Alien(int id, String name) {
    // we can redefine the constructor class again to do something extra

    public Alien {
        if (id == 0) {
            throw new IllegalArgumentException("Id cannot be zero");
        }
    }

}

public class RedoceDemo {

    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Navin");
        Alien a2 = new Alien(0, "Navin");
        System.out.println(a1); // The two strin also defined in this recor    de
        System.out.println("Comparing two object with same value  : " + a1.equals(a2));
    }
}
    