// my first program

import com.google.cloud.spanner.DatabaseClient;
import com.google.cloud.spanner.DatabaseId;
import com.google.cloud.spanner.ResultSet;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;
import com.google.cloud.spanner.Statement;
// import com.google.cloud.spanner.InstanceAdminClient;
import com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient;
import com.google.spanner.admin.instance.v1.Instance;
import com.google.spanner.admin.instance.v1.ProjectName;
import java.io.IOException;

public class HelloWorld {
  public static void main(String[] args) throws IOException {
    System.out.println("Hello World!");

    try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
      ProjectName parent = ProjectName.of("test-project");
      for (Instance element : instanceAdminClient.listInstances(parent).iterateAll()) {
        System.out.println(element);
      }
    }
  }

}
