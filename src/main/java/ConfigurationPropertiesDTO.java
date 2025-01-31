import java.util.ArrayList;
import java.util.Random;

public class ConfigurationPropertiesDTO {


    double ConsumerDelayMin;
    double ConsumerDelayMax;
    double ProducerDelayMin;
    double ProducerDelayMax;
    double ConsumersDelay; //(depende de delay min y max - ver arriba)
    double ProducersDelay; //(depende de delay min y max - ver arriba)
    double StartProducerDelayMin;
    double StartProducerDelayMax;
    double StartConsumerDelayMin;
    double StartConsumerDelayMax;
    double ProducersNumber; //(max, min) da el numero actualizado de productores
    double ConsumersNumber; //(max, min)da el numero actualizado de consumidores
    final int minquantity;
    final int maxquantity;
    int ResourcesTypeQuantity;

    final Model model;


    public ConfigurationPropertiesDTO(Model model, int minquantity, int maxquantity, int ResourcesTypeQuantity, double StartProducerDelayMin,
                                      double StartProducerDelayMax, double consumerDelayMin,
                                      double consumerDelayMax, double ProducerDelayMin, double ProducerDelayMax, double ProducersNumber,
                                      double ConsumersNumber, double StartConsumerDelayMin, double StartConsumerDelayMax) {

        this.minquantity = minquantity;
        this.maxquantity = maxquantity;
        this.StartProducerDelayMin = StartProducerDelayMin;
        this.StartProducerDelayMax = StartProducerDelayMax;
        this.ConsumerDelayMin = consumerDelayMin;
        this.ConsumerDelayMax = consumerDelayMax;
        this.ProducerDelayMin = ProducerDelayMin;
        this.ProducerDelayMax = ProducerDelayMax;
        this.ProducersNumber = ProducersNumber;
        this.ConsumersNumber = ConsumersNumber;
        this.StartConsumerDelayMin = StartConsumerDelayMin;
        this.StartConsumerDelayMax = StartConsumerDelayMax;
        this.model = model;
        this.ResourcesTypeQuantity = ResourcesTypeQuantity;

        //this.consumers = new ArrayList<>();
        //this.producers = new ArrayList<>();
        //this.resourcesTypes = new ArrayList<>();

        //this.createResources();
        //this.createConsumers();
        //this.createProducers();
    }



}
