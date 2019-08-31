//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.demo.generate;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyBatisPlusGenerator {
    public MyBatisPlusGenerator() throws IOException {
    }

    @Test
    public void codeGenerator() throws IOException, InterruptedException {
        File file1 = new File("");
        String filePath1 = file1.getCanonicalPath();
        System.out.println(filePath1);
        System.out.println(filePath1);
        System.out.println(ConfigAllParam.package1);
        //注意要进行转义.
        String[] tmp5 = ConfigAllParam.package1.split("\\.");

        System.out.println(tmp5);
        System.out.println(tmp5[0]);
        String tmp6 = String.join("/", tmp5);
        System.out.println(tmp6);

        String tmp2 = filePath1 + "/src/main/java/" + tmp6 + '/';
        System.out.println(tmp2);

        String[] tmp3 = new String[]{tmp2 + "controller", tmp2 + "entity",  tmp2 + "mapper", tmp2 + "service"};

        System.out.println(tmp3[0]);

        for (String tmp61:tmp3
             ) {DeleteDirectory.delAllFile(new File(tmp61));

        }


        AutoGenerator mpg = new AutoGenerator();
        GlobalConfig gc = new GlobalConfig();
        File file = new File("");
        String filePath = file.getCanonicalPath();
        System.out.println(filePath);
        System.out.println(filePath);
        gc.setOutputDir(filePath + "/src/main/java");
        gc.setAuthor("zhagnbo284");
        gc.setOpen(false);
        mpg.setGlobalConfig(gc);
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(ConfigAllParam.springDatasourceUrl);
        dsc.setDriverName(ConfigAllParam.driver);
        dsc.setUsername(ConfigAllParam.username);
        dsc.setPassword(ConfigAllParam.password);
        mpg.setDataSource(dsc);
        System.out.println(dsc);
        PackageConfig pc = new PackageConfig();
        pc.setParent(ConfigAllParam.package1);
        mpg.setPackageInfo(pc);
        InjectionConfig cfg = new InjectionConfig() {
            public void initMap() {
            }
        };
        List<FileOutConfig> focList = new ArrayList();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            public String outputFile(TableInfo tableInfo) {
                return filePath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper" + ".xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);



        mpg.setTemplate((new TemplateConfig()).setXml((String)null));
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.entityTableFieldAnnotationEnable(true);
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
