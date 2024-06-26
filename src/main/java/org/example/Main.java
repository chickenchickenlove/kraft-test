package org.example;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.BytesDeserializer;

public class Main {
    public static void main(String[] args) {

        Properties props = new Properties();
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "111023212541010");
        props.put(ConsumerConfig.CLIENT_ID_CONFIG, "1-2");
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:10000");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, BytesDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, BytesDeserializer.class.getName());
        props.put(ConsumerConfig.GROUP_PROTOCOL_CONFIG, "consumer");

        final KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(props);
        kafkaConsumer.subscribe(List.of("test-topic1"));

        while (true) {
            ConsumerRecords<String, String> poll = kafkaConsumer.poll(Duration.ofMillis(1000));
            for (ConsumerRecord<String, String> stringStringConsumerRecord : poll) {
                System.out.println(stringStringConsumerRecord);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
