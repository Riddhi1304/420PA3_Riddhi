package com.assiegnment2;

public class iweightable {
    public interface IWeightable {
        public double getWeight();
    }
    public class Cargo implements IWeightable{
       private double weight;
       public Cargo(double weight){
           this.weight=weight;
       }
       @Override
        public double getWeight(){
           return weight;
       }
    }
    public class Person implements IWeightable{
        private double weight;
        public Person(double weight){
            this.weight=weight;
        }
        @Override
        public double getWeight(){
            return weight;
        }
    }
    public class Airplane{
            private List<IWeightable> weightables;

            public Airplane() {
                weightables = new ArrayList<>();
            }

            public void addWeightable(IWeightable weightable) {
                weightables.add(weightable);
            }

            public double calculateTotalWeight() {
                double totalWeight = 0;
                for (IWeightable weightable : weightables) {
                    totalWeight += weightable.getWeight();
                }
                return totalWeight;
            }
    }
}

