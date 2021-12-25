public class Human extends AHuman {

    private Human.AHumanNested humanNested;
    Human(String name) {
        this.name = name;
        humanNested = this.new AHumanNested();
    }

    public static class HumanActions{
        public static String sawAction() {
            return ", кто впервые увидел ";
        }
        public static String dontBelievedAction(){
            return ", ни за что не поверил бы, что перед ним ";
        }
    }

    public String saw(AHuman.AHumanNested human) {
        return humanNested.getName() + HumanActions.sawAction() + human.getName();
    }

    public String dontBelieved(AHuman.AHumanNested human) {
        return HumanActions.dontBelievedAction() + human.getName();
    }

    public String lostWeight() {
        if (feel == Feelings.GREED) {
            return "худел " + humanNested.getName() + " вовсе не от того, что ему нечего было кушать, а от собственной жадности.";
        } else {
            return "худел " + humanNested.getName();
        }
    }

    public String spend(ObjectsStory objectsStory) {
        return "Каждый раз, когда " + humanNested.getName() + " приходилось истратить " + objectsStory.getName();
    }

    public String toBeNervous() {
        return ", " + humanNested.getName() + " так нервничал,";
    }

    public String torment() {

        class Greedy{
            private String name;

            public Greedy(){
                this.name = "жданость";
            }

            public String getName(){
                return this.name;
            }
        }

        if (feel == Feelings.GREED) {
            Greedy greedy = new Greedy();
            return " так теразался от " + greedy.getName();
        } else {
            return "терзался";
        }
    }

    public String loseWeight() {
        return ", что терял в весе.";
    }

    public String gainWeight() {
        return ", но все равно не мог потолстеть, ";
    }

    public String compensate() {
        return "Чтобы возместить эти потери, ";
    }

    public String ate() {
        return humanNested.getName() + " съедал ежедневно по четыре завтрака, по четыре обеда и четыре ужина";
    }

    public String hasSpent() {
        return " истратил на пищу слишком уж большую сумму денег.";
    }

    public String knew() {
        return humanNested.getName() + " прекрасно знал";
    }

    public String cantDoSomething() {
        return " ничего поделать не мог.";
    }

    public String thinking(ObjectsStory objectsStory) {
        return humanNested.getName() + " почему-то забрал себе в голову, что его и без того " + objectsStory.bigCapital();
    }

}
