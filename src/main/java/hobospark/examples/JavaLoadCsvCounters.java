package hobospark.examples;

import spark.api.java.JavaPairRDD;
import spark.api.java.JavaSparkContext;
import spark.api.java.function.FlatMapFunction;

import au.com.bytecode.opencsv.CSVReader;

import java.io.StringReader;

public class JavaLoadCsvCounters {
  public static void main(String[] args) throws Exception {
    if (args.length != 2) {
	System.err.println("Usage: JavaLoadCsvCounters <master> <inputfile>");
	System.exit(1);
    }
    String master = args[0];
    String inputFile = args[1];
    JavaSparkContext sc = new JavaSparkContext(master, "java load csv with counters",
        System.getenv("SPARK_HOME"), System.getenv("JARS"));
    Accumulator[Int] errors = sc.accumulator(0);
  }
}