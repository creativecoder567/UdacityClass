package com.example.sarath.udacityclass.service;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.sarath.udacityclass.R;

public class JobServiceActivity extends AppCompatActivity {
public static final String TAG="sarath";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_service);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void scheduleJob(View view) {
        ComponentName componentName = new ComponentName(this,ExampleJobService.class);
        JobInfo info = new JobInfo.Builder(123,componentName)
                .setRequiresCharging(true)
                .setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED)
                .setPersisted(true)
                .setPeriodic(15*60*1000)
                .build();

        JobScheduler scheduler = (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
        scheduler.schedule(info);
        int resultCode = scheduler.schedule(info);
        if (resultCode == JobScheduler.RESULT_SUCCESS){
            Log.d(TAG, "Job Scheduled ");
        }else
            Log.d(TAG, "Job Sceduling Failed ");
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void cancelJob(View view) {
        JobScheduler scheduler = (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
        scheduler.cancel(123);
        Log.d(TAG, "JobCancelled");
    }
}
