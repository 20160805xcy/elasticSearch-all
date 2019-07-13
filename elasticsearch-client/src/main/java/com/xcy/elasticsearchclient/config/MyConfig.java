package com.xcy.elasticsearchclient.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author xcy
 * @Desc
 * @date 2019/7/8 23:09
 * @Version v1.0
 */
@Configuration
public class MyConfig {

    @Bean
    public TransportClient client() throws UnknownHostException {
        //一个节点
        InetSocketTransportAddress node = new InetSocketTransportAddress(InetAddress.getByName("localhost"),
                9300); //elasticsearch的TCP默认端口为9300

        //集群名(默认的集群名为elasticsearch,但是如果不指定,则会导致认证不成功,所以此处指定为wali)
        Settings settings = Settings.builder()
                .put("cluster.name", "xcy")
                .build();

        //TransportClient client = new PreBuiltTransportClient(settings);
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        //添加一个节点到client(也可多个)
        client.addTransportAddress(node);
        return client;
    }

}
