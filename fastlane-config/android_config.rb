module FastlaneConfig
  module AndroidConfig
    STORE_CONFIG = {
      default_store_file: "release_keystore.keystore",
      default_store_password: "Sensei@2k25",
      default_key_alias: "sensei-projects",
      default_key_password: "Sensei@2k25"
    }

    FIREBASE_CONFIG = {
      firebase_prod_app_id: "1:749347496134:android:c207d3a8586f97db63b7c7",
      firebase_demo_app_id: "1:749347496134:android:080da6859ca5967d63b7c7",
      firebase_service_creds_file: "secrets/firebaseAppDistributionServiceCredentialsFile.json",
      firebase_groups: "sensei-app-testers"
    }

    BUILD_PATHS = {
      prod_apk_path: "cmp-android/build/outputs/apk/prod/release/cmp-android-prod-release.apk",
      demo_apk_path: "cmp-android/build/outputs/apk/demo/release/cmp-android-demo-release.apk",
      prod_aab_path: "cmp-android/build/outputs/bundle/prodRelease/cmp-android-prod-release.aab"
    }
  end
end