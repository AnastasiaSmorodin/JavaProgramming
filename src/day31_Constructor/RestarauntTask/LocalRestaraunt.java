package day31_Constructor.RestarauntTask;

public class LocalRestaraunt {
    public static void main(String[] args) {
        Restaraunt restaraunt1=new Restaraunt("Anastasia","Destin",4);
       Server server1= new Server();
       server1.setInfo("Alina",123,12,true);
        Server server2= new Server();
        server2.setInfo("Marina",124,13,true);
        Server server3= new Server();
        server3.setInfo("Kuzat",125,14,false);
Server[] servers={server1,server2,server3};
    Chef chef1=new Chef();
    chef1.setInfo("Poz",321,20,false);
        Chef chef2=new Chef();
        chef2.setInfo("Serghei",320,25,true);
        Chef chef3=new Chef();
        chef3.setInfo("Dubina",299,28,true);
        Chef[] chefs={chef1,chef2,chef3};


        restaraunt1.hireServer(servers);
        restaraunt1.hireChef(chefs);
        

        System.out.println( restaraunt1);


        for(Server eachServer : restaraunt1.serversList){
            System.out.println(eachServer.name+ " : "+ eachServer.hourlyRate + " "+ eachServer.fullTime);
        }

        for (Chef eachChef : restaraunt1.chefsList){
            System.out.println(eachChef.name + " : "+eachChef.hourlyRate+" "+eachChef.fullTime);
        }


    }
}
