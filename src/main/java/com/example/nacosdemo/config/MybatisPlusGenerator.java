package com.example.nacosdemo.config;



import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MybatisPlusGenerator {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG =
            new DataSourceConfig.Builder("jdbc:mysql://127.0.0.1:3306/wg_cyc_wms?useUnicode=true&useSSL=false&characterEncoding=utf8",
                    "root",
                    "li322411")
                    .dbQuery(new MySqlQuery())
                    .typeConvert(new MySqlTypeConvert());

    /**
     * 父模块包名
     */
    private static String moduleName;

    public static void main(String[] args) {

        String generatorPath = System.getProperty("user.dir");
        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                // 全局配置
                //自己改自己的名字 别上传scanner.apply("请输入作者名称？")
                .globalConfig((scanner, builder) -> builder.author(scanner.apply("请输入作者名称？"))
                        .outputDir(generatorPath + "/src/main/java") //文件输出路径
                        .disableOpenDir()
                        .enableSwagger()
                        .commentDate("yyyy-MM-dd"))
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent("com.example.nacosdemo")
                        .entity("pojo")
                        .service("service")
                        .serviceImpl("service.impl")
                        .mapper("mapper")
                        .xml("mapper")
                        .controller("controller")
                        .pathInfo(new HashMap<OutputFile, String>(16) {{
                                      //xml 文件输出路径
                                      put(OutputFile.mapperXml, generatorPath + "/src/main/resources/mapper/");
                                  }}
                        ))
                // 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                     //   .addTablePrefix(getTablePrefix(moduleName))
                        .controllerBuilder()
                        .enableRestStyle()
                        .enableHyphenStyle()
                        .entityBuilder()
                        .enableChainModel()
                        .enableLombok()
                        .enableTableFieldAnnotation()
                        .build())
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }



    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }

    /**
     * @param moduleName
     * @return
     * @description 获取父包模块名赋值
     * @date 2022/5/20 14:57
     */
    public static void initModuleName(String moduleName) {
        MybatisPlusGenerator.moduleName = moduleName;
    }
}
