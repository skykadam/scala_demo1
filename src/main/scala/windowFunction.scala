import org.apache.spark.sql._
import org.apache.spark.sql.functions._
class windowFunction {  def main(args: Array[String]) {
  val spark = SparkSession.builder.master("local[*]").appName("WindowFunction").getOrCreate()
  //    val ssc = new StreamingContext(spark.sparkContext, Seconds(10))
  val sc = spark.sparkContext
  sc.setLogLevel("ERROR")
  import spark.implicits._
  import spark.sql
  val data="D:\\data engineering\\BigData\\datasets\\otherdatasets\\bank.csv"
  val df =spark.read.format("csv").option("sep",";").option("header","true").option("inferSchema","true").load(data)
  df.show()

  spark.stop()
}




}
