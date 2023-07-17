package a0713;

public class Student {
    public static void main(String[] args) {
    @Override
    public int hashCode() {
        return studentNum;
    }
}
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student))
            return false;
        Student student = (Student) obj;
        if (studentNum != student.studentNum)
            return false;
        return true;
    }
}


