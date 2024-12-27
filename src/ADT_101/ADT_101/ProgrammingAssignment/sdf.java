package ADT_101.ProgrammingAssignment;

class Student{
    private String cd;
    private String id;
    private String first;
    private String last;

    public Student(String cd,String id,String first,String last){
        this.cd = cd;
        this.id = id;
        this.first = first;
        this.last = last;
    }
    public String getCd(){
        return cd;
    }

    public String getId(){
        return id;
    }
    public String getFirst(){
        return first.strip();
    }
    public String getLast(){
        return last;
    }

    @Override
    public String toString() {
        return id +"  "+first+" "+last;
    }
}