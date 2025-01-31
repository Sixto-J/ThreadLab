import java.util.Random;

public class Model {


    enum State {Play, Ended, Stopped}

    public Model(){



    }

    private void createResources() {
        for (int i = 0; i < this.resources.length; i++) {
            String productName = this.resources[generateNumber(this.resources.length)];
            this.resourcesTypes.add(new ResourcesType( this.maxquantity, this.minquantity, productName, ResourcesTypeQuantity));
        }
    }


    private int generateNumber(int listSize) {
        Random random = new Random();
        return random.nextInt(listSize);
    }
    private void createConsumers() {
        for (int i = 0; i < this.consumers.size(); i++) {
            int number = generateNumber(names.length);
            String consumerName = this.names[number];
            ResourcesType resource = this.resourcesTypes.get(generateNumber(resourcesTypes.size()));
            this.names = removeName(number);
            //this.consumers.add(new Consumer(this.model, consumerName, resource[generateNumber(resources.length)]));
            //hacer metodo para asignar un ResourceType a un consumer
        }
    }

    private void createProducers() {
        for (int i = 0; i < this.producers.size(); i++) {
            int number = generateNumber(100);
            String producerName = this.names[number];
            ResourcesType resource = this.resourcesTypes.get(generateNumber(resourcesTypes.size()));
            this.names = removeName(number);
            //this.producers.add(new Producer(this.model, producerName, resource[generateNumber(resources.length)]));
            // hacer metodo para asignar un ResourceType a un producer
        }
    }

    void getResourceInfo(){}
    void getProducerInfo(){}
    void getConsumerInfo(){}
    void play(){}
    void stop(){}

}
