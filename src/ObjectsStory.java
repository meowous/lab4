public class ObjectsStory extends AObjects{

    ObjectsStory(String name) {
        this.name = name;
    }

    public String growingUp() {
        return getName() + " непрестанно должно расти";
    }

    public String capitalName() {
        return " капитал ";
    }

    public String bigCapital(){
        return "колосальное состояние непременно должно расти." + "\n" + "И если Господин Скуперфильд удавалось увеличить свой капитал хоть на один фертинг, Господин Скуперфильд готов был прыгать от радости;" + "\n" + "когда же необходимо было истратить фертинг, Господин Скуперфильд приходил в отчаяние, Господин Скуперфильд казалось, что начинается светопреставление, " + "\n" + "что скоро все фертинги, словно под воздействием какой-то злой силы, уплывут из сундуков и Господин Скуперфильд из богача превратится в нищего.";
    }

    public String andIfHeCouldScopeHisCapital(){
        return "и если ему удавалось увеличить свой" + capitalName();
    }
}