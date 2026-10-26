INSERT INTO event (id, title, description, category, starts_at, ends_at, capacity) VALUES
  ('00000000-0000-0000-0000-000000000001', 'Spring Boot Meetup', 'Monthly meetup covering what''s new in Spring Boot and the wider Spring ecosystem.', 'TECH', '2026-11-03 18:00:00+01', '2026-11-03 21:00:00+01', 80),
  ('00000000-0000-0000-0000-000000000002', 'Intro to Kubernetes Workshop', 'Hands-on workshop: deploy your first app to a Kubernetes cluster.', 'TECH', '2026-11-07 10:00:00+01', '2026-11-07 16:00:00+01', 25),
  ('00000000-0000-0000-0000-000000000003', 'PostgreSQL Performance Deep Dive', 'Indexes, query plans and vacuum explained with real-world examples.', 'TECH', '2026-11-12 18:30:00+01', '2026-11-12 20:30:00+01', 60),
  ('00000000-0000-0000-0000-000000000004', 'Frontend Friday: React Server Components', 'Talk and Q&A on building apps with React Server Components.', 'TECH', '2026-11-14 17:00:00+01', '2026-11-14 19:00:00+01', 100),
  ('00000000-0000-0000-0000-000000000005', 'Hackathon: Open Data', 'A 24-hour hackathon building tools on top of public open data sets.', 'TECH', '2026-11-21 09:00:00+01', '2026-11-22 09:00:00+01', 150),
  ('00000000-0000-0000-0000-000000000006', 'Observability with Grafana', 'Metrics, logs and traces: setting up a full observability stack.', 'TECH', '2026-11-26 18:00:00+01', '2026-11-26 20:00:00+01', 50),
  ('00000000-0000-0000-0000-000000000007', 'Rust for Java Developers', 'An introduction to Rust ownership and borrowing from a JVM perspective.', 'TECH', '2026-12-02 18:30:00+01', '2026-12-02 21:00:00+01', 40),
  ('00000000-0000-0000-0000-000000000008', 'Messaging with RabbitMQ', 'Exchanges, queues and reliable delivery patterns in practice.', 'TECH', '2026-12-08 18:00:00+01', '2026-12-08 20:00:00+01', 45),
  ('00000000-0000-0000-0000-000000000009', 'Secure APIs with Spring Security', 'OAuth2, JWT and method security for REST APIs.', 'TECH', '2026-12-15 18:00:00+01', '2026-12-15 21:00:00+01', 70),
  ('00000000-0000-0000-0000-000000000010', 'Year-End Tech Talks', 'Lightning talks from the community, followed by drinks.', 'TECH', '2026-12-18 17:00:00+01', '2026-12-18 22:00:00+01', 200)
ON CONFLICT (id) DO UPDATE SET
  title = EXCLUDED.title,
  description = EXCLUDED.description,
  category = EXCLUDED.category,
  starts_at = EXCLUDED.starts_at,
  ends_at = EXCLUDED.ends_at,
  capacity = EXCLUDED.capacity;
